/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.management.compute.VirtualMachineAgentInstanceView;
import java.util.List;
import com.microsoft.azure.management.compute.DiskInstanceView;
import com.microsoft.azure.management.compute.VirtualMachineExtensionInstanceView;
import com.microsoft.azure.management.compute.VirtualMachineHealthStatus;
import com.microsoft.azure.management.compute.BootDiagnosticsInstanceView;
import com.microsoft.azure.management.compute.InstanceViewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of a virtual machine scale set VM.
 */
public class VirtualMachineScaleSetVMInstanceViewInner {
    /**
     * The Update Domain count.
     */
    @JsonProperty(value = "platformUpdateDomain")
    private Integer platformUpdateDomain;

    /**
     * The Fault Domain count.
     */
    @JsonProperty(value = "platformFaultDomain")
    private Integer platformFaultDomain;

    /**
     * The Remote desktop certificate thumbprint.
     */
    @JsonProperty(value = "rdpThumbPrint")
    private String rdpThumbPrint;

    /**
     * The VM Agent running on the virtual machine.
     */
    @JsonProperty(value = "vmAgent")
    private VirtualMachineAgentInstanceView vmAgent;

    /**
     * The disks information.
     */
    @JsonProperty(value = "disks")
    private List<DiskInstanceView> disks;

    /**
     * The extensions information.
     */
    @JsonProperty(value = "extensions")
    private List<VirtualMachineExtensionInstanceView> extensions;

    /**
     * The health status for the VM.
     */
    @JsonProperty(value = "vmHealth", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineHealthStatus vmHealth;

    /**
     * Boot Diagnostics is a debugging feature which allows you to view Console
     * Output and Screenshot to diagnose VM status. &lt;br&gt;&lt;br&gt; For
     * Linux Virtual Machines, you can easily view the output of your console
     * log. &lt;br&gt;&lt;br&gt; For both Windows and Linux virtual machines,
     * Azure also enables you to see a screenshot of the VM from the
     * hypervisor.
     */
    @JsonProperty(value = "bootDiagnostics")
    private BootDiagnosticsInstanceView bootDiagnostics;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * The placement group in which the VM is running. If the VM is deallocated
     * it will not have a placementGroupId.
     */
    @JsonProperty(value = "placementGroupId")
    private String placementGroupId;

    /**
     * Get the platformUpdateDomain value.
     *
     * @return the platformUpdateDomain value
     */
    public Integer platformUpdateDomain() {
        return this.platformUpdateDomain;
    }

    /**
     * Set the platformUpdateDomain value.
     *
     * @param platformUpdateDomain the platformUpdateDomain value to set
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withPlatformUpdateDomain(Integer platformUpdateDomain) {
        this.platformUpdateDomain = platformUpdateDomain;
        return this;
    }

    /**
     * Get the platformFaultDomain value.
     *
     * @return the platformFaultDomain value
     */
    public Integer platformFaultDomain() {
        return this.platformFaultDomain;
    }

    /**
     * Set the platformFaultDomain value.
     *
     * @param platformFaultDomain the platformFaultDomain value to set
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withPlatformFaultDomain(Integer platformFaultDomain) {
        this.platformFaultDomain = platformFaultDomain;
        return this;
    }

    /**
     * Get the rdpThumbPrint value.
     *
     * @return the rdpThumbPrint value
     */
    public String rdpThumbPrint() {
        return this.rdpThumbPrint;
    }

    /**
     * Set the rdpThumbPrint value.
     *
     * @param rdpThumbPrint the rdpThumbPrint value to set
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withRdpThumbPrint(String rdpThumbPrint) {
        this.rdpThumbPrint = rdpThumbPrint;
        return this;
    }

    /**
     * Get the vmAgent value.
     *
     * @return the vmAgent value
     */
    public VirtualMachineAgentInstanceView vmAgent() {
        return this.vmAgent;
    }

    /**
     * Set the vmAgent value.
     *
     * @param vmAgent the vmAgent value to set
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withVmAgent(VirtualMachineAgentInstanceView vmAgent) {
        this.vmAgent = vmAgent;
        return this;
    }

    /**
     * Get the disks value.
     *
     * @return the disks value
     */
    public List<DiskInstanceView> disks() {
        return this.disks;
    }

    /**
     * Set the disks value.
     *
     * @param disks the disks value to set
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withDisks(List<DiskInstanceView> disks) {
        this.disks = disks;
        return this;
    }

    /**
     * Get the extensions value.
     *
     * @return the extensions value
     */
    public List<VirtualMachineExtensionInstanceView> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions value.
     *
     * @param extensions the extensions value to set
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withExtensions(List<VirtualMachineExtensionInstanceView> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the vmHealth value.
     *
     * @return the vmHealth value
     */
    public VirtualMachineHealthStatus vmHealth() {
        return this.vmHealth;
    }

    /**
     * Get the bootDiagnostics value.
     *
     * @return the bootDiagnostics value
     */
    public BootDiagnosticsInstanceView bootDiagnostics() {
        return this.bootDiagnostics;
    }

    /**
     * Set the bootDiagnostics value.
     *
     * @param bootDiagnostics the bootDiagnostics value to set
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withBootDiagnostics(BootDiagnosticsInstanceView bootDiagnostics) {
        this.bootDiagnostics = bootDiagnostics;
        return this;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses value.
     *
     * @param statuses the statuses value to set
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Get the placementGroupId value.
     *
     * @return the placementGroupId value
     */
    public String placementGroupId() {
        return this.placementGroupId;
    }

    /**
     * Set the placementGroupId value.
     *
     * @param placementGroupId the placementGroupId value to set
     * @return the VirtualMachineScaleSetVMInstanceViewInner object itself.
     */
    public VirtualMachineScaleSetVMInstanceViewInner withPlacementGroupId(String placementGroupId) {
        this.placementGroupId = placementGroupId;
        return this;
    }

}
